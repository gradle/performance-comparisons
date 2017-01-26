package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_388 {
    private final Production19_388 production = new Production19_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}