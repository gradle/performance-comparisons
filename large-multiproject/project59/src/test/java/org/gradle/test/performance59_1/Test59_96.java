package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_96 {
    private final Production59_96 production = new Production59_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}