package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_338 {
    private final Production91_338 production = new Production91_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}