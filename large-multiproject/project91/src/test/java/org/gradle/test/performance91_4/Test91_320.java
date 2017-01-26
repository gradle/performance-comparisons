package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_320 {
    private final Production91_320 production = new Production91_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}