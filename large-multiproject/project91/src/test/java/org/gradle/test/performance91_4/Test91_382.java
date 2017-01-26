package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_382 {
    private final Production91_382 production = new Production91_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}