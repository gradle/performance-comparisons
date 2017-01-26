package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_88 {
    private final Production59_88 production = new Production59_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}