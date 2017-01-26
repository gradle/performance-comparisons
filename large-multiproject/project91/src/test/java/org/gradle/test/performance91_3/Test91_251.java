package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_251 {
    private final Production91_251 production = new Production91_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}