package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_288 {
    private final Production19_288 production = new Production19_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}