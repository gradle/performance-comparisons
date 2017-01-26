package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_320 {
    private final Production59_320 production = new Production59_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}