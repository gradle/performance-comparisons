package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_80 {
    private final Production59_80 production = new Production59_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}