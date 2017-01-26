package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_134 {
    private final Production19_134 production = new Production19_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}