package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_166 {
    private final Production59_166 production = new Production59_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}