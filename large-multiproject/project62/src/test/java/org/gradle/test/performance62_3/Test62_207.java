package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_207 {
    private final Production62_207 production = new Production62_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}