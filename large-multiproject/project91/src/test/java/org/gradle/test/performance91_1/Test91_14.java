package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_14 {
    private final Production91_14 production = new Production91_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}