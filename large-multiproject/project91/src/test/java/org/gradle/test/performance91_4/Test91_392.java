package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_392 {
    private final Production91_392 production = new Production91_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}