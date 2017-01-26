package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_268 {
    private final Production19_268 production = new Production19_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}