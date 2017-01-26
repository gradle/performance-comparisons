package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_297 {
    private final Production91_297 production = new Production91_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}