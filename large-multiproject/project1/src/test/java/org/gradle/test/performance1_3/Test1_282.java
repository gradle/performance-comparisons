package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_282 {
    private final Production1_282 production = new Production1_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}