package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_253 {
    private final Production91_253 production = new Production91_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}