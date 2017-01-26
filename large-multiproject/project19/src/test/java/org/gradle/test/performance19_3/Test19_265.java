package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_265 {
    private final Production19_265 production = new Production19_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}