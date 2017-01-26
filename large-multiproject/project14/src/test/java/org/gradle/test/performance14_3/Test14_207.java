package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_207 {
    private final Production14_207 production = new Production14_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}