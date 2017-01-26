package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_202 {
    private final Production59_202 production = new Production59_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}