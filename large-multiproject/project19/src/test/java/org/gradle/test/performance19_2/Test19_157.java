package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_157 {
    private final Production19_157 production = new Production19_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}