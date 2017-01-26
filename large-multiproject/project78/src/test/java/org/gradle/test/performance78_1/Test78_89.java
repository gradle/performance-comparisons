package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_89 {
    private final Production78_89 production = new Production78_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}