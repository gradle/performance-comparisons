package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_172 {
    private final Production34_172 production = new Production34_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}