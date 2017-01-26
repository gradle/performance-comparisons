package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_207 {
    private final Production74_207 production = new Production74_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}