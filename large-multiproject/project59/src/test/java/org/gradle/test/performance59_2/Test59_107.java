package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_107 {
    private final Production59_107 production = new Production59_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}