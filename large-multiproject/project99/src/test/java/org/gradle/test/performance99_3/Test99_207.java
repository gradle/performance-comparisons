package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_207 {
    private final Production99_207 production = new Production99_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}