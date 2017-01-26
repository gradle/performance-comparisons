package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_45 {
    private final Production19_45 production = new Production19_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}