package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_3 {
    private final Production19_3 production = new Production19_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}