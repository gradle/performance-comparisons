package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_367 {
    private final Production19_367 production = new Production19_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}