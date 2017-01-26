package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_202 {
    private final Production19_202 production = new Production19_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}