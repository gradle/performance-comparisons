package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_458 {
    private final Production19_458 production = new Production19_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}