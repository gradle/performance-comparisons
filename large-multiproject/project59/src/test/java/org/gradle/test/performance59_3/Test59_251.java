package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_251 {
    private final Production59_251 production = new Production59_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}