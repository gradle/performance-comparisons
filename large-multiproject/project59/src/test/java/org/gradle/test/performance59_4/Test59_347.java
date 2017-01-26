package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_347 {
    private final Production59_347 production = new Production59_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}