package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_202 {
    private final Production91_202 production = new Production91_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}