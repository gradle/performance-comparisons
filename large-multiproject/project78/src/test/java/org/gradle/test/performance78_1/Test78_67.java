package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_67 {
    private final Production78_67 production = new Production78_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}