package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_119 {
    private final Production19_119 production = new Production19_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}