package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_172 {
    private final Production59_172 production = new Production59_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}