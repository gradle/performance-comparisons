package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_26 {
    private final Production19_26 production = new Production19_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}