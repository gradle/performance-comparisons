package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_390 {
    private final Production59_390 production = new Production59_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}