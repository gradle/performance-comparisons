package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_268 {
    private final Production91_268 production = new Production91_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}