package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_286 {
    private final Production91_286 production = new Production91_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}