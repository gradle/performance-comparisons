package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_207 {
    private final Production1_207 production = new Production1_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}