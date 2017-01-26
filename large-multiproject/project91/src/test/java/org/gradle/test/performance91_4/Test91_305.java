package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_305 {
    private final Production91_305 production = new Production91_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}