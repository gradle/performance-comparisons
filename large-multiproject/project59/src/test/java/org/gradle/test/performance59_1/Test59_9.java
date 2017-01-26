package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_9 {
    private final Production59_9 production = new Production59_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}