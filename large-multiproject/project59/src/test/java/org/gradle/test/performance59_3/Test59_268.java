package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_268 {
    private final Production59_268 production = new Production59_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}