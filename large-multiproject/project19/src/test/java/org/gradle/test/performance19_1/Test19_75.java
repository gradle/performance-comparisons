package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_75 {
    private final Production19_75 production = new Production19_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}