package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_80 {
    private final Production19_80 production = new Production19_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}