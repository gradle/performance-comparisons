package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_126 {
    private final Production19_126 production = new Production19_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}