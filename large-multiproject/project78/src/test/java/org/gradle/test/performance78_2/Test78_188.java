package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_188 {
    private final Production78_188 production = new Production78_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}