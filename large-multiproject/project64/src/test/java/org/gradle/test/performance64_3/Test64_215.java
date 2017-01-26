package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_215 {
    private final Production64_215 production = new Production64_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}