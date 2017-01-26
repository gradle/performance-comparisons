package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_392 {
    private final Production19_392 production = new Production19_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}