package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_303 {
    private final Production91_303 production = new Production91_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}