package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_444 {
    private final Production59_444 production = new Production59_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}