package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_172 {
    private final Production19_172 production = new Production19_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}