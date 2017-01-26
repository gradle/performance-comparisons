package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_207 {
    private final Production9_207 production = new Production9_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}