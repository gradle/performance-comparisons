package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_297 {
    private final Production59_297 production = new Production59_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}